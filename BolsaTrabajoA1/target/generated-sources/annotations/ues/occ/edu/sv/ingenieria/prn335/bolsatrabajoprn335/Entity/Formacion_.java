package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Persona;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-28T11:06:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Formacion.class)
public class Formacion_ { 

    public static volatile SingularAttribute<Formacion, String> nivelEducativo;
    public static volatile SingularAttribute<Formacion, Date> fechaHasta;
    public static volatile SingularAttribute<Formacion, Long> idFormacion;
    public static volatile SingularAttribute<Formacion, Date> fechaDesde;
    public static volatile SingularAttribute<Formacion, String> institucion;
    public static volatile SingularAttribute<Formacion, String> titulo;
    public static volatile SingularAttribute<Formacion, Boolean> titulado;
    public static volatile SingularAttribute<Formacion, Persona> idPersona;

}