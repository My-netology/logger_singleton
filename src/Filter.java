import java.util.List;

public class Filter {
    private final int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Старт фильтрации списка.");
        List<Integer> result = source.stream().filter(x -> x < treshold).toList();
        logger.log("Завершение фильтрации списка.");
        return result;
    }
}
