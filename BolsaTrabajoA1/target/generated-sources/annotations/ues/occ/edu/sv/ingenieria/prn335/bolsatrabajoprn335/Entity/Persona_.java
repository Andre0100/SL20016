package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Documento;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Experiencia;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Formacion;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.MedioContacto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-28T11:06:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile ListAttribute<Persona, Documento> documentoList;
    public static volatile ListAttribute<Persona, Formacion> formacionList;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile SingularAttribute<Persona, String> genero;
    public static volatile SingularAttribute<Persona, String> direccion;
    public static volatile ListAttribute<Persona, Experiencia> experienciaList;
    public static volatile ListAttribute<Persona, MedioContacto> medioContactoList;
    public static volatile SingularAttribute<Persona, Long> idPersona;
    public static volatile SingularAttribute<Persona, String> nombres;

}