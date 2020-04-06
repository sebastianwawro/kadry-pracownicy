package pl.edu.prz.weii.kia.kadry.kadrypracownicy.entity.lecture2;

import pl.edu.prz.weii.kia.kadry.kadrypracownicy.exception.theArcException;

import javax.persistence.*;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Entity
@Table(name = "ModeleLaptopow")
public class ModelLaptopa implements Serializable {
    @ManyToOne @JoinColumn(name = "id_matrycy_lcd", nullable = true)
    protected MatrycaLCD matrycaLCD;

    @ManyToOne @JoinColumn(name = "id_matrycy_oled", nullable = true)
    protected MatrycaOLED matrycaOLED;

    @PrePersist
    @PreUpdate
    public void checkTheArc() {
        if (!(matrycaLCD == null && matrycaOLED != null ||
              matrycaLCD != null && matrycaOLED == null))
        {
            throw new theArcException(); //extends RuntimeException
        }
    }

    private void writeObject(ObjectOutputStream stream)
    throws java.io.IOException
    {
        checkTheArc();
        stream.defaultWriteObject();
    }

    public ModelLaptopa(MatrycaLCD matrycaLCD, MatrycaOLED matrycaOLED) {
        this.matrycaLCD = matrycaLCD;
        this.matrycaOLED = matrycaOLED;
    }

    public MatrycaLCD getMatrycaLCD() {
        return matrycaLCD;
    }

    public void setMatrycaLCD(MatrycaLCD matrycaLCD) {
        this.matrycaLCD = matrycaLCD;
    }

    public MatrycaOLED getMatrycaOLED() {
        return matrycaOLED;
    }

    public void setMatrycaOLED(MatrycaOLED matrycaOLED) {
        this.matrycaOLED = matrycaOLED;
    }
}
