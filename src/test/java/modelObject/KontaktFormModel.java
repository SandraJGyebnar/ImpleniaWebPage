package modelObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class KontaktFormModel extends BaseModel{
    private String vornameElement;
    private String nachnameElement;
    private String emailElement;
    private String unternehmenElement;
    private String adresseElement;
    private String telefonElement;
    private String nachrichtElement;

    public KontaktFormModel(String jsonFilePath) {
        super(jsonFilePath);
    }

}
