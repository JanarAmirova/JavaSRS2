public class testGarage {
 public static void main(String[] args) {
  GarageCar myGarage = new GarageCar(); //создаем новый гараж 
  Car myCar1 = new Car("Ford", 200, "Mustang", 2, false); //создаем легковую машину 
  myGarage.addCar(myCar1); // добавл€ем ее в гараж 
  myGarage.addCar(new Car("LADA", 140, "Kalina", 4, false)); //добавл€ем еще одну машину 
  Truck myTruck = new Truck("Dove", 160, "DTS", 700, true); //создаем грузовик 
  myGarage.addCar(myTruck); //добавл€ем его в гараж 
  myGarage.printGarage(); //выводи на экран содержимое гаража 
  if (myGarage.findCar(myCar1)) { //ищем машину 
   System.out.println("ƒа");
  } else {
   System.out.println("Ќет");
  }
 }
}