package day26_ClassandObject.Dog;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.Breed="German Wolf";
        dog1.Size="Medium";
        dog1.age=12;
        dog1.Color="Yellow and Black";
        dog1.Name="Cont";
        dog1.Gender= 'M';

        dog1.getInfo();

        Dog dog2 = new Dog();
        dog2.Breed="Husky";
        dog2.Size="Large";
        dog2.age=4;
        dog2.Color="Gray";
        dog2.Name="Rosco";
        dog2.Gender= 'F';


        dog2.getInfo();

    }

}
