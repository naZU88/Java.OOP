package HW2;

public class Cat {
    private String name;
    private int appetite;
    private boolean full = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        int food = plate.getFood();
        if (appetite > food) {
            System.out.println("Еды недостаточно");
        } else {
            food = food - appetite;
            plate.setFood(food);
            System.out.printf("На тарелке осталось %d еды. Ваш кот сыт.\n", food);
            this.full = true;
        }
    
     }
     public Boolean getFull() {
       return full;
   }

   public void setFull(Boolean full) {
       this.full = full;
   }

    public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public Integer getAppetite() {
       return appetite;
   }
   
   public void setAppetite (int appetite) {
       this.appetite = appetite;
   }
}
