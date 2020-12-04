public class Main {
    public static void main(String[] args) {
        Employee[] persons= new Employee[5];
        persons [0] = new Employee("Ivanov Ivan Ivanych", "Leader", "ivanov@mail.ru", "123456789", 50000, 45);
        persons [1] = new Employee("Petrov Petr Petrovich", "Teacher", "petrov@mail.ru", "234567891", 40000, 28);
        persons [2] = new Employee("Sidorov Sidor Sidorovich", "Engineer", "sidorov@mail.ru", "345678912", 45000, 35);
        persons [3] = new Employee("Nekrasova Natalya Sergeevna", "Baker", "nekrasova@mail.ru", "456789123", 15500, 50);
        persons [4] = new Employee("Likhacheva Anastasia Borisovna", "Developer","likhacheva@mail.ru", "567891234", 49000, 39);
        int n=1;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40) {
                System.out.print(n + " ");
                persons[i].printInfo();
                n++;
            }
        }

    }
}
