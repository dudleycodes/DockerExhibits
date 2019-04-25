FROM golang:latest as GOLANG-BUILDER

COPY hello.go /src/hello.go

RUN go build -o /app/hello /src/hello.go

FROM alpine

COPY --from=GOLANG-BUILDER /app/hello /app/hello

CMD ["/app/hello"]
