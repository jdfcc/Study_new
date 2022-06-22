package map.example_plus;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class student implements Comparable<student>{

    private String address;

    public student(){}
    public student( String add){

        this.address=add;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public int compareTo(@NotNull student o) {
        boolean num;
        int num1;
        num1=1;
        num=this.address.equals(o.address);
        if(num){
            num1=0;
        }
        return num1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}
