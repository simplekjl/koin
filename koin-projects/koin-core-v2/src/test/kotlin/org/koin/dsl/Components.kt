package org.koin.dsl

class Simple {
    class ComponentA()
    class ComponentB(val a: ComponentA)
    class ComponentC(val b: ComponentB)
}