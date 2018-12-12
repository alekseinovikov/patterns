package me.freedom4live.patterns.kotlin.prototype

data class IdealPerson(val name: String) : Cloneable {
    public override fun clone(): IdealPerson = super.clone() as IdealPerson
}
