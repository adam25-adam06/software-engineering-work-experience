package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge3(request: Request) {
    if ((request.name== "")||(request.email== "")||(request.phone== "")||(request.address== ""))
        println("A mandatory field is missing!")
}
