package modelObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class HomeModel extends BaseModel{

    private String heroVideoElement;
    private String spotlightAnsehenButtonElement;

    public HomeModel(String jsonFilePath) {
        super(jsonFilePath);
    }
}
