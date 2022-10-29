package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Persona;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.TipoMedioContacto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-28T11:06:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(MedioContacto.class)
public class MedioContacto_ { 

    public static volatile SingularAttribute<MedioContacto, TipoMedioContacto> idTipoMedioContacto;
    public static volatile SingularAttribute<MedioContacto, Date> fechaModificacion;
    public static volatile SingularAttribute<MedioContacto, String> valor;
    public static volatile SingularAttribute<MedioContacto, Persona> idPersona;
    public static volatile SingularAttribute<MedioContacto, Long> idMedioContacto;

}