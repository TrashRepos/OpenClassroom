package analytics;

import java.util.*;

import analytics.ReadSymptomDataFromFile;
public class AnalyticsCounter implements ISymptomCounter {

	private List<String> symptomsFromFile;
	/**
	 * 
	 * @param symptomsFromFile
      a full or partial path to file with symptom strings in it, one per line
	 */
    public static void main(String[] args) {
        ReadSymptomDataFromFile shit = new ReadSymptomDataFromFile("analytics/symptoms.txt");
        System.out.println(shit.GetSymptoms());
        
    }

	public AnalyticsCounter (List<String> symptomsFromFile) {
		this.symptomsFromFile = symptomsFromFile ;
   }

    public TreeMap <String, Integer> GetCountTreeMap() {
        TreeMap<String, Integer> symptomsResult = new TreeMap<String, Integer>();
        for(String element : symptomsFromFile) {
            Integer h = symptomsResult.get(element);
            symptomsResult.put(element, (h == null) ? 1 : h + 1);
        } 
        for (Map.Entry<String, Integer> val : symptomsResult.entrySet()) {
            System.out.println("Element" + val.getKey() + " " + "occurs" + ": " + val.getValue() + " times");
        }
        return symptomsResult;
        }
}