# Lezione 40 del 04/07/2025

## Indice

1. [Regex](#regex)
2. [Testing](#testing)
3. [JDBC e le Select](#jdbc-e-le-select)

## Regex

. \* ^ $ [] {}

/ escape

## Testing

### I Java Test Unite

## JDBC e Le Select

### a

per quanto riguarda la restituizione di un select, che sia un unico valore va usato:

```Java
ResultSet rs = ps.execute();
var p = new Persona();

if( rs.next() )
{
    p.setcf(rs.getString("cf"));
    ...
}
```

Quando si hanno molti valori...

```Java
ResultSet rs = ps.executeQuery();
Persona p = new Persona();
ArrayList<Persona> list = new ArrayList<>();

while( rs.next() )
{
    p.setcf(rs.getString("cf"));
    ...
    list.add(p);
}
```

---
