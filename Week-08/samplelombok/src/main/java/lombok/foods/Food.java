package lombok.foods;

import org.joda.time.LocalDate;

public interface Food {

    String getName();

    Long getWeight();

    Long getCalories();

    Float getQualityMultiplier();

    void setQualityMultiplier(Float multiplier);

    LocalDate getCreationDate();
}
