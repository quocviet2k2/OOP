package countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {

        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(
                    "E:/code-intellij/demo/src/main/java/countrylistmanager/data/countries.csv"));

            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .build();

                /*
                 * TODO
                 * Từ dữ liệu nhận được, tạo các đối tượng Country và đưa và CountryListManager
                 * để quản lý.
                 */
                CountryListManager countryListManager = CountryListManager.getInstance();
                CountryFactory countryFactory = CountryFactory.getInstance();

                AbstractCountry newCountry = countryFactory.createCountry(dataList.get(5), newCountryData);
                countryListManager.append(newCountry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        testOriginalData();
        /* TODO */
        testSortPopulationIncreasing();
        testSortPopulationDecreasing();
        testSortAreaIncreasing();
        testSortAreaDecreasing();
        testSortGdpIncreasing();
        testSortGdpDecreasing();
        testFilterContinent();
        testFilterCountriesMostPopulous();
        testFilterCountriesLeastPopulous();
        testFilterCountriesLargestArea();
        testFilterCountriesSmallestArea();
        testFilterCountriesHighestGdp();
        testFilterCountriesLowestGdp();
    }

    public static void init() {
        String filePath = "data/countries2.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        CountryListManager manager = CountryListManager.getInstance();
        List<AbstractCountry> countryList = manager.getCountryList();
        System.out.println("Original data: ");
        CountryListManager.print(countryList);
    }

    public static void testSortPopulationIncreasing() {
        /* TODO */
        init();
        List<AbstractCountry> sortedCountries = CountryListManager.getInstance().sortPopulationIncreasing();
        CountryListManager.print(sortedCountries);
    }

    public static void testSortPopulationDecreasing() {
        /* TODO */
        init();
        List<AbstractCountry> sortedCountries = CountryListManager.getInstance().sortPopulationDecreasing();
        CountryListManager.print(sortedCountries);
    }

    public static void testSortAreaIncreasing() {
        /* TODO */
        init();
        List<AbstractCountry> sortedCountries = CountryListManager.getInstance().sortAreaIncreasing();
        CountryListManager.print(sortedCountries);
    }

    public static void testSortAreaDecreasing() {
        /* TODO */
        init();
        List<AbstractCountry> sortedCountries = CountryListManager.getInstance().sortAreaDecreasing();
        CountryListManager.print(sortedCountries);
    }

    public static void testSortGdpIncreasing() {
        /* TODO */
        init();
        List<AbstractCountry> sortedCountries = CountryListManager.getInstance().sortGdpIncreasing();
        CountryListManager.print(sortedCountries);
    }

    public static void testSortGdpDecreasing() {
        /* TODO */
        init();
        List<AbstractCountry> sortedCountries = CountryListManager.getInstance().sortGdpDecreasing();
        CountryListManager.print(sortedCountries);
    }

    public static void testFilterContinent() {
        /* TODO */
        init();
        List<AbstractCountry> filteredCountries = CountryListManager.getInstance().filterContinent("Asia");
        CountryListManager.print(filteredCountries);
    }

    public static void testFilterCountriesMostPopulous() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationDecreasing();
        List<AbstractCountry> nMostPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nMostPopulousCountries.add(countries.get(i));
        }
        CountryListManager.print(nMostPopulousCountries);
    }

    public static void testFilterCountriesLeastPopulous() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationIncreasing();
        List<AbstractCountry> nLeastPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLeastPopulousCountries.add(countries.get(i));
        }
        CountryListManager.print(nLeastPopulousCountries);
    }

    public static void testFilterCountriesLargestArea() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortAreaDecreasing();
        List<AbstractCountry> nLargestAreaCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLargestAreaCountries.add(countries.get(i));
        }
        CountryListManager.print(nLargestAreaCountries);
    }

    public static void testFilterCountriesSmallestArea() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortAreaIncreasing();
        List<AbstractCountry> nSmallestAreaCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nSmallestAreaCountries.add(countries.get(i));
        }
        CountryListManager.print(nSmallestAreaCountries);
    }

    public static void testFilterCountriesHighestGdp() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortGdpDecreasing();
        List<AbstractCountry> nHighestGdpCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestGdpCountries.add(countries.get(i));
        }
        CountryListManager.print(nHighestGdpCountries);
    }

    public static void testFilterCountriesLowestGdp() {
        /* TODO */
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortGdpIncreasing();
        List<AbstractCountry> nLowestGdpCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestGdpCountries.add(countries.get(i));
        }
        CountryListManager.print(nLowestGdpCountries);
    }
}
