import java.io.Serializable;

public final class Student implements Serializable {
    final String name;
    final int number;

    public Student(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
    public String getName()
    {
        return name;
    }
    public int getNumber()
    {
        return number;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == this)
        {
            return true;
        }

        if(!(o instanceof Student)&&!(o instanceof Serializable))
        {
            return false;
        }

        Student stud = (Student) o;

        return getNumber() == stud.getNumber()
                && getName() == stud.getName();

    }

    @Override
    public int hashCode()
    {
        int result = getName().hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString()
    {
        return "Student " + name + " has number " + number;
    }

    @Override
    public Student clone()
    {
        try {
            Student result = (Student) super.clone();
            return result;
        } catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}
