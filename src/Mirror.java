import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mirror  extends SuperClass implements Investigator
{
    private Object toInvestigate;

    public Mirror()
    {

    }

    public Mirror(int x, int y)
    {

    }

    private Mirror(int y)
    {

    }

    protected Mirror(char ch)
    {

    }

    private void gogo()
    {

    }

    public void gogoPublic()
    {

    }

    protected void gogoProtected()
    {

    }

    @Override
    public void load(Object anInstanceOfSomething)
    {
        toInvestigate = anInstanceOfSomething;
        int numberOfMethods = getTotalNumberOfMethods();
        System.out.printf("numberOfMethods = % d\n", numberOfMethods);

        int numberOfConstructors = getTotalNumberOfConstructors();
        System.out.printf("numberOfConstructors = % d\n", numberOfConstructors);

        int numberOfFields  = getTotalNumberOfFields();
        System.out.printf("numberOfFields = %d\n", numberOfFields);

        Set<String> names  =  getAllImplementedInterfaces();
        for(String nameL: names)
        {
            System.out.println(nameL);
        }
    }

    @Override
    public int getTotalNumberOfMethods()
    {
        Class toInvestigateClass = toInvestigate.getClass();
        return toInvestigateClass != null? toInvestigateClass.getDeclaredMethods().length : 0;
    }

    @Override
    public int getTotalNumberOfConstructors()
    {
        int numberOfConstructors = 0;
        Constructor[] constructors  = toInvestigate.getClass().getDeclaredConstructors();
        numberOfConstructors = constructors.length;
//        for(Constructor constructor: constructors)
//        {
//            System.out.println(Arrays.toString(constructor.getParameterTypes()));
//        }

        return numberOfConstructors;
    }

    @Override
    public int getTotalNumberOfFields()
    {
        int numberOfFields = 0;

        Field[] fields = toInvestigate.getClass().getDeclaredFields();
        numberOfFields = fields.length;
        for(Field field: fields)
        {
            System.out.println(field.getName());
        }

        return numberOfFields;
    }

    @Override
    public Set<String> getAllImplementedInterfaces()
    {
        int numberOfInterfaces = 0;
        Class[] interfaces = toInvestigate.getClass().getInterfaces();
        Set<String> interfacesNames = new HashSet<>();
        for(Class objectInterface: interfaces)
        {
            interfacesNames.add(objectInterface.getName());
        }
        numberOfInterfaces = interfaces.length;


        return interfacesNames;
    }

    @Override
    public int getCountOfConstantFields()
    {
        return 0;
    }

    @Override
    public int getCountOfStaticMethods()
    {
        return 0;
    }

    @Override
    public boolean isExtending()
    {
        return false;
    }

    @Override
    public String getParentClassSimpleName()
    {
        return null;
    }

    @Override
    public boolean isParentClassAbstract()
    {
        return false;
    }

    @Override
    public Set<String> getNamesOfAllFieldsIncludingInheritanceChain()
    {
        return null;
    }

    @Override
    public int invokeMethodThatReturnsInt(String methodName, Object... args)
    {
        return 0;
    }

    @Override
    public Object createInstance(int numberOfArgs, Object... args)
    {
        return null;
    }

    @Override
    public Object elevateMethodAndInvoke(String name, Class<?>[] parametersTypes, Object... args)
    {
        return null;
    }

    @Override
    public String getInheritanceChain(String delimiter)
    {
        return null;
    }
}