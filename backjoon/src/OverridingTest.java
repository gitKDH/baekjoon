public class OverridingTest {
    public static void main(String[] args) {
        Student st = new Student();

        st.name = "홍길동";
        st.age = 100;
        st.sex = "남";
        st.print();

    }
    static class People{
        String name;
        int age;

        void print(){
            System.out.println("이름 "+this.name+"나이 "+this.age);
        }

    }
    static class Student extends People{
        String sex;

        void print(){
            System.out.println("이름 "+this.name+" 나이 "+this.age);
            System.out.println(this.name+"의 성별은 "+sex+"입니다.");
        }
    }
}
