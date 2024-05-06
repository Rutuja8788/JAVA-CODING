import java.util.*;
public class Linkedhash
{
    public static void main(String args[])
        {

            LinkedHashSet<String> lhs
                    = new LinkedHashSet<>();

            lhs.add("Rutuja");
            lhs.add("For");
            lhs.add("Rutuja");
            lhs.add("Is");
            lhs.add("Very helpful");

            // Traversing elements
            Iterator<String> itr = lhs.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

