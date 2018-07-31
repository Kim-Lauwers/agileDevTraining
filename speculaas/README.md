# Speculaas

## Assignment

### What do I do?

The Artisanal Bakers Association trusts your technical prowess to solve their problem. A lot of _Hasseltse [Speculaas](https://en.wikipedia.org/wiki/Speculaas)_ is being baked, but no one exactly knows what the **best** _Speculaas_ is. Write a method that rates _speculaas_ based on the ingredients. The function should look like this:

```java
	public int rateSpeculaas(final Speculaas speculaas) {
		...
	}
```

This function should return a number. The higher the number, the better the rating and the happier the baker.
The argument `speculaas` can contain these properties:
herbs, butter, sugar, eggs, milk, honey, flower, salt, leavening. Each property is simply a number that expresses the amount in grams. For example:

```java
    final int butter = 250;
    final int flower = 1000;
    final int salt = 10;
    final int milk = 100;
    ...
```

#### So how do I know which _Speculaas_ scores better?
Keep It Simple Stupid, and just count all the ingredients.

You can find example usage of the method in the test.

### Unit testen

We already supplied some unit tests. 
Feel free to add your own tests when necessary!

#### What exactly do I test?
Well what about industrial _speculaas_ without any herbs, or a recipe that has all the things?

What does your function do when the given `speculaas` argument is `null`?

What if you pass a `speculaas` without any ingredients?

Try to cover all exceptional cases.

## Inspiration
This exercise comes from https://github.com/Sch3lp. I have ported it to a Java-version.