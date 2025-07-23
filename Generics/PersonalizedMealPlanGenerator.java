package level_1;
interface MealPlan {
    String getMealDetails();
}

class VegetarianMeal implements MealPlan {
    public String getMealDetails() {
        return "Vegetarian Meal: Lentils, Vegetables, Rice";
    }
}

class VeganMeal implements MealPlan {
    public String getMealDetails() {
        return "Vegan Meal: Quinoa, Tofu, Mixed Veggies";
    }
}

class KetoMeal implements MealPlan {
    public String getMealDetails() {
        return "Keto Meal: Chicken, Avocado, Cheese";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealDetails() {
        return "High-Protein Meal: Eggs, Tuna, Beans";
    }
}

class Meal<T extends MealPlan> {
    private T mealType;
    public Meal(T mealType) {
        this.mealType = mealType;
    }
    public T getMealType() {
        return mealType;
    }
    public void displayMeal() {
        System.out.println(mealType.getMealDetails());
    }
}

public class PersonalizedMealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        return new Meal<>(mealType);
    }
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = generateMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal = generateMealPlan(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = generateMealPlan(new HighProteinMeal());
        vegMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();
        proteinMeal.displayMeal();
    }
}
