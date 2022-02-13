# Enable HTTP2 by Spring WebMVC (with Tomcat)

## How to test

```bash
$ ./gradlew bootRun

$ curl -I --http2 http://localhost:8080/ok
```
