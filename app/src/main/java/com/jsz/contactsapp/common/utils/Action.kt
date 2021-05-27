package com.jsz.contactsapp.common.utils


/**
 * This class is used to pass functions in the UiModel and so we can still compare UiModel instances.
 * When passing functions as params of the data classes, comparing them becomes much more difficult.
 */
class Action<in T>(
    private val action: (T) -> Unit
) {

    operator fun invoke(event: T) = action(event)

    override fun equals(other: Any?): Boolean = when {
        other === this -> true
        other is Action<*> -> true
        else -> false
    }

    override fun hashCode(): Int = 0

    override fun toString(): String = "Action@${super.hashCode()}"

}

val NoOp = Action<Any?> {}

operator fun Action<Unit>.invoke() = invoke(Unit)
