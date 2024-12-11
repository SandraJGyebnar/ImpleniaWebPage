package modelObject;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class JobSearchInDeutschlandModel extends BaseModel{

    private String landElement;
    private String stadtElement;
    private String taetigkeitsbereichElement;
    private String anstellungsverhaeltnisElement;
    private String gesellschaftElement;



    public JobSearchInDeutschlandModel(String jsonFilePath) {
        super(jsonFilePath);
    }
}
