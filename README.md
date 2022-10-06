# Lab4


# Description:

The root class, common-to-all classes, which ties all my actors in the simulation, is the `SuperClass`. I've made it as an abstract class to not be able to create an instance of this class. It contains common atributes as `mealNr`, `deckNr`, `cardNr` ... `reputation`. I'm using this atributes to provide a statistic in the end of my simulation. Also it has setters and getters.

`SuperClass` is inherited by `Entities` and `Human` abstract classes. `Human` is used to store atributes common to all descendent classes `names`  - array with names for actors, `phrases` - array of phrases for actors, `random`, `name` - randomly choosed name, `opinion` and methods. I've created abstraction using abstract classes and abstract methods like `greeting()`, `speak()`, `goodbye()`.

Abstract class `Human` is inherited by `Cook`, `Waiter`, `Cleaner`, `Barman`, `Admin`, `Player`. All this classes provide implementations for abstract methos from `Human` class.

Abstract class `Entities` is inherited by `Card`, `Deck`, `Meal`, `Menu`, `Table`. I've made it as an abstract class to not be able to create an instance of this class. All classes use `change()` to change the object if it's too old. In this momnet, we increase the value of atributes from `SuperClass` by 1. Second method `qualityCheck()` is used to analize the quality of object. If it's new, user can keep it, if not he'll change it and the `reputation` will decrease. To improve my simulation I used Polymorthism. Method qualityCheck() is overriden in all child classes of Entity class.

My project contains an interface `Action` with two methods `tip()` and `complaint()`. This interface is implemented by Player and Waiter classes. If our player is satisfied enough he will call the method tip() wich will provide randomply what amount of money to live for waiter. If player is not satisfied he will make an complaint and the reputation of our restaurant will decrease.  Waiter uses the method tip() by increasing the reputation of our restaurant and providing an answer for player. Complaint is also used for a text result.

