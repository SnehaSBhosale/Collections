import java.util.*;
import java.util.ArrayList;
public class CollectionEx
{
public static void main(String args[])
{
ArrayList<String>list= new ArrayList<String>();
list.add("sneha");
list.add("suraj");
list.add("Atharv");
list.add("Neha");
list.add("Archana");
list.add("Saroja");
list.remove(5);
Iterator ltr = list.iterator();
while(ltr.hasNext())
{
System.out.println(ltr.next());
}
}
}