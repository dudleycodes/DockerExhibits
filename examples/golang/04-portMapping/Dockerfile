FROM golang:latest as GOLANG-BUILDER

COPY ./gin-gonic-examples/basic/ /src/

WORKDIR /src

RUN go get "github.com/gin-gonic/gin"

RUN CGO_ENABLED=0 GOOS=linux GOARCH=amd64 go build -a -o webapp

FROM alpine

COPY --from=GOLANG-BUILDER /src/webapp /app/webapp

CMD ["/app/webapp"]
