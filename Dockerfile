FROM scsb-base as builder
WORKDIR application
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} scsb-shiro-base.jar
RUN java -Djarmode=layertools -jar scsb-shiro-base.jar extract

FROM scsb-base

WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/scsb-shiro-base.jar/ ./
ENTRYPOINT java -jar -Denvironment=$ENV scsb-shiro-base.jar && bash
