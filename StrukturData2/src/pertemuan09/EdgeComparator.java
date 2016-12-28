package pertemuan09;

import java.util.Comparator;

/**
 *
 * @author Lycorice
 */
public class EdgeComparator implements Comparator<Edge>{
    public int compare(Edge o1, Edge o2){
        if (o1.getDistanceVertex()<o2.getDistanceVertex()) return -1;
        if (o1.getDistanceVertex()>o2.getDistanceVertex()) return 1;
        return 0;
    }
}
