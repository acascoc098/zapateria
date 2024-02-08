# ZAPATERÍA

**Anotaciones lombok**:

* `@data`: Genera todos los getters y setters, toString, hasCode y compare. Genera constructor con todos los atributos.
* `@NoArgsConstructor`: Genera el constructor vacío que hace falta para JAXB.

**Anotaciones jakarta.persitence** *(antiguamente java.persistence)*:

* `@Entity`: El objeto (clase) con esta anotación será una tabla en la BBDD
* `@Id`: El atributo marcado con esta anotación será la clave primaria de la tabla correspondiente al objeto o clase.
* `@ManytoOne`: Marcamos así atributos que son a su vez entidades  (clases modelo) con los que tenemos una relación de muchos a uno (N:1). Lo ponemos en atributos que son a su vez clases entidad que yo he definido (para indicar clave foránea)
* `@OnetoMany`: Marcamos así atributos que son a su vez entidades  (clases modelo) con los que tenemos una relación de uno a muchos (1:N, lo que nos da una lista o similar)
* `@ManytoAny`: Igual que _ManytoOne_ pero cuando puede ser **NULL** la clave foránea referenciada
* `@OnetoOne`:
* `@GeneratedValue(strategy = GenerateType.IDENTITY)`: Unido a `@Id`, será el *AUTO_INCRMENT*  de mySQL
* `@Column(length = 10)`: Para ponerle una longitud a un atributo *VARCHAR(10)*
* `@ManytoOne`: Lo ponemos en atributos que son a su vez clases entidad que yo he definido (para indicar clave foránea)
* `@Oneto`