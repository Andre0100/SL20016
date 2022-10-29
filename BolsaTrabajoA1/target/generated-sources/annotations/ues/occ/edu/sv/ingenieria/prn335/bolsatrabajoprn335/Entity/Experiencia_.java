package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Persona;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-28T11:06:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Experiencia.class)
public class Experiencia_ { 

    public static volatile SingularAttribute<Experiencia, Date> fechaHasta;
    public static volatile SingularAttribute<Experiencia, Date> fechaDesde;
    public static volatile SingularAttribute<Experiencia, Long> idExperiencia;
    public static volatile SingularAttribute<Experiencia, String> institucion;
    public static volatile SingularAttribute<Experiencia, String> posicionLaboral;
    public static volatile SingularAttribute<Experiencia, String> referencia;
    public static volatile SingularAttribute<Experiencia, Persona> idPersona;

}