package builder;

public class Person {
    public String name;
    public  String email;
    public String address;
    public int age;

    public Person(String name, String email, String address, int age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Address: " + address + ", Age: " + age;
    }

    public static class Builder {
        private String name;
        private String email;
        private String address;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, email, address, age);
        }
    }
}
