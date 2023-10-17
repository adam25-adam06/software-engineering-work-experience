package io.github.u.ways

import io.github.u.ways.domain.Request

fun challenge1(request: Request) {
     if ((request.landline||request.mobile) && (request.internet||request.tv)) {
println ("Routing to Telecom and Broadband department")}
    else if (request.internet||request.tv) {
       println("Routing to Broadband department")
    } else if (request.landline||request.mobile){
        println ("Routing to Telecom department")}   
}

