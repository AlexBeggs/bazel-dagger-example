package app

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Component(modules = [MyModule::class])
interface MyComponent {
  fun coffeeMachine(): CoffeeMachine
}

@Module
class MyModule {
  @Provides
  fun coffee() : Coffee {
    return Coffee("Starbucks")
  }
}

data class Coffee(val name: String)


class MyApp {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val myComponent: MyComponent = DaggerMyComponent.builder().build()
      val coffeeMachine = myComponent.coffeeMachine()
      println(coffeeMachine.coffee)
    }
  }
}
