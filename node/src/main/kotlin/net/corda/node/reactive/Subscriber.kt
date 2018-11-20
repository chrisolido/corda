package net.corda.node.reactive

interface Subscriber<ELEMENT> {

    fun onSubscribe(subscription: Subscription)

    fun onNext(element: ELEMENT)

    fun onNoNext()

    fun onError(error: Throwable)

    fun onComplete()
}