FROM golang:latest

COPY hello.go /src/hello.go

RUN go build -o /app/hello /src/hello.go

CMD ["/app/hello"]
