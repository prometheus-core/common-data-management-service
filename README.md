![Logo](https://github.com/prometheus-core/common-file-management-service/blob/master/docs/_images/prometheus-core-logo.png)


# Common Data Management Service

[![license](https://img.shields.io/github/license/prometheus-core/common-file-management-service.svg?style=plastic)](https://github.com/prometheus-core/common-file-management-service)
[![Travis](https://img.shields.io/travis/prometheus-core/common-file-management-service.svg?style=plastic)](https://travis-ci.org/prometheus-core/common-file-management-service/branches)
[![Github All Releases](https://img.shields.io/github/downloads/prometheus-core/common-file-management-service/total.svg?style=plastic)](https://github.com/prometheus-core/common-file-management-service)
[![GitHub issues](https://img.shields.io/github/issues/prometheus-core/common-file-management-service.svg?style=plastic)](https://github.com/prometheus-core/common-file-management-service)

[![Codacy grade](https://img.shields.io/codacy/grade/e7dc9ed202da4839aa73a8f4f5c65b38.svg?style=plastic)](https://app.codacy.com/app/archenroot/common-file-management-service)
[![Codacy coverage](https://img.shields.io/codacy/coverage/e7dc9ed202da4839aa73a8f4f5c65b38.svg?style=plastic)](https://app.codacy.com/app/archenroot/common-file-management-service)
[![codecov](https://codecov.io/gh/prometheus-core/common-file-management-service/branch/master/graph/badge.svg?style=plastic)](https://codecov.io/gh/prometheus-core/common-file-management-service/branch/master)

[![David](https://img.shields.io/david/prometheus-core/common-file-management-service.svg?style=plastic)](https://github.com/prometheus-core/common-file-management-service)
[![David](https://img.shields.io/david/dev/prometheus-core/common-file-management-service.svg?style=plastic)](https://github.com/prometheus-core/common-file-management-service)
[![David](https://img.shields.io/david/optional/prometheus-core/common-file-management-service.svg?style=plastic)](https://github.com/prometheus-core/common-file-management-service)
[![David](https://img.shields.io/david/peer/prometheus-core/common-file-management-service.svg?style=plastic)](https://github.com/prometheus-core/common-file-management-service)

## Description
Generic approach to manage any kind of file system objects with support of multiple protocols or filesystems.

The whole system is in the moment implemented as state of art microservice architecture meaning I follow following core patterns:
- Event sourcing
- Sagas
- CQRS

## Features:
- Supports common file system object manipulation operation: COPY, CREATE, DELETE, MOVE
- These atomic operations can be mixed up to complex scenarios in kind of flow diagram to achieve any kind of goal
- Supports multiple file systems and communication protocols: CIFS(Samba or Windows Share), FTP, FTPS, SFTP (More can and will be added in future)
- Support generic definition of entity definition, where entity can be single or multiple files or directories even across multiple endpoints
- Supports both regex and so called CustomObjectMasks which introduce more business usable masks: YYYY, MM, ... (Can be easily extended)
- Path (directory and/or file) is in the system represented as sequence of multiple objects (Strings, CustomObjectMasks)
- Built in metrics and auditing
- Exposes both REST (Open API 3.0 standard) and Websockets endpoints
- More to be added....
- Management UI (in scope to be implemented in v)
## Use Cases

Copy data from Windows Share to SFTP server
Archive data, TODO



## Build Status

[travis-home]: https://travis-ci.org/
[travis-msgpack-tools]: https://travis-ci.org/prometheus-core/common-file-management-service

[branch-master]: https://github.com/prometheus-core/common-file-management-service/tree/master

<!-- we use some deprecated HTML attributes here to get these stupid badges to line up properly -->
<!--
| Branch        |  [CI Build][travis-home]           | Coverage           |
| ------------- |:-------------:|:-------------:|
| [master] [branch-master]     | [![Build Status](https://travis-ci.org/prometheus-core/common-file-management-service.svg?branch=master)](https://travis-ci.org/prometheus-core/common-file-management-service) |  |
-->

## Start server

Run with

```
mvn package exec:exec
``

## Test

By default, all endpoints are protected by OAuth jwt token verifier. It can be turned off with config change through for development.


In order to access the server, there is a long lived token below issued by my
oauth2 server [light-oauth2](https://github.com/networknt/light-oauth2)

```
Bearer eyJraWQiOiIxMDAiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJ1cm46Y29tOm5ldHdvcmtudDpvYXV0aDI6djEiLCJhdWQiOiJ1cm46Y29tLm5ldHdvcmtudCIsImV4cCI6MTc5MDAzNTcwOSwianRpIjoiSTJnSmdBSHN6NzJEV2JWdUFMdUU2QSIsImlhdCI6MTQ3NDY3NTcwOSwibmJmIjoxNDc0Njc1NTg5LCJ2ZXJzaW9uIjoiMS4wIiwidXNlcl9pZCI6InN0ZXZlIiwidXNlcl90eXBlIjoiRU1QTE9ZRUUiLCJjbGllbnRfaWQiOiJmN2Q0MjM0OC1jNjQ3LTRlZmItYTUyZC00YzU3ODc0MjFlNzIiLCJzY29wZSI6WyJ3cml0ZTpwZXRzIiwicmVhZDpwZXRzIl19.mue6eh70kGS3Nt2BCYz7ViqwO7lh_4JSFwcHYdJMY6VfgKTHhsIGKq2uEDt3zwT56JFAePwAxENMGUTGvgceVneQzyfQsJeVGbqw55E9IfM_uSM-YcHwTfR7eSLExN4pbqzVDI353sSOvXxA98ZtJlUZKgXNE1Ngun3XFORCRIB_eH8B0FY_nT_D1Dq2WJrR-re-fbR6_va95vwoUdCofLRa4IpDfXXx19ZlAtfiVO44nw6CS8O87eGfAm7rCMZIzkWlCOFWjNHnCeRsh7CVdEH34LF-B48beiG5lM7h4N12-EME8_VDefgMjZ8eqs1ICvJMxdIut58oYbdnkwTjkA
```

Postman is the best tool to test REST APIs

Add "Authorization" header with value as above token and a dummy message will return from the generated stub.


