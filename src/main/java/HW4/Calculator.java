package HW4;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Data
public class Calculator {
    /**
     * @param numbers array of numbers
     * @return result of operation based on method
     * @apiNote 1)расширить класс калькулятор на умножение
     * 2)расширить класс калькулятор на деление
     * 3)расширить класс калькулятор на бинарный перевод
     */
    Double summa(@org.jetbrains.annotations.NotNull List<? extends Number> numbers) {
        double result = 0.0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    Double multiplication(@NotNull List<? extends Number> numbers) {
        double result = 1;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }

    <T extends Number> @NotNull Double division(@NotNull T x, @NotNull T y) {
        return x.doubleValue() / y.doubleValue();
        }
    <T> Integer toBinary (String numbers){
        String binaryStr = String.valueOf(numbers).replace(".0", "");
        int cut = Integer.parseInt(binaryStr);
        StringBuilder res = new StringBuilder();
        while (cut > 0){
            Integer rem = cut % 2;
            res.append(rem);
            cut /= 2;
        }
        res.reverse();
        return Integer.valueOf(res.toString());
    }
}
