# Maratón Git 2026-1

## Integrantes
- Juan Diego Melo Suarez(Rol A & B)
- www.linkedin.com/in/juan-diego-melo-suarez-7a31bb22b
- [Ver Hoja de Vida (PDF)](./Juan_Melo_Resume.pdf)
---

## Retos completados

### Reto 1: Configuración y creación de rama
**Evidencia:**
(Aquí pondrás una captura de pantalla de tus ramas en IntelliJ o Git Bash)

**Descripción:**
Creación de la estructura de paquetes y configuración inicial del repositorio.

### Reto 2: Commit colaborativo
**Evidencia:**
(Pendiente)
**Descripción:**
(Pendiente)

---

## Preguntas teóricas
## Preguntas teóricas

**1. ¿Cuál es la diferencia entre git merge y git rebase?**
`git merge` fusiona dos ramas creando un nuevo "commit de fusión" que une las historias, preservando la cronología exacta de cuándo sucedió cada cosa. `git rebase` reescribe la historia, tomando los cambios de una rama y poniéndolos en la punta de la otra de forma lineal, como si hubieran sucedido uno detrás del otro, eliminando la estructura de ramas del historial.

**2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?**
Git detendrá el proceso automáticamente porque no sabe con cuál versión quedarse. Marcará el archivo como "en conflicto" (conflict), agregando marcadores especiales (`<<<<<<<`, `=======`, `>>>>>>>`) en el código para que el desarrollador decida manualmente qué contenido conservar antes de completar la fusión.

**3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?**
Utilizando el comando:
`git log --oneline --graph --decorate --all`

**4. Explica la diferencia entre un commit y un push.**
* **Commit:** Es guardar los cambios en tu **repositorio local**. Es como "tomar una foto" del estado actual de tu código en tu propia computadora.
* **Push:** Es enviar esos commits guardados al **repositorio remoto** (GitHub), para que el resto del equipo pueda verlos y descargarlos.

**5. ¿Para qué sirven git stash y git pop?**
* `git stash`: Guarda temporalmente los cambios en los que estás trabajando (que aún no quieres commitear) en una "pila" de memoria sucia, dejando tu directorio de trabajo limpio para poder cambiar de rama sin perder nada.
* `git stash pop`: Recupera y aplica los últimos cambios guardados en el stash a tu directorio actual y los elimina de la pila.

**6. ¿Qué diferencia hay entre HashMap y HashTable?**
* [cite_start]**Sincronización:** `Hashtable` es sincronizado (thread-safe), lo que significa que es seguro para usar en hilos múltiples pero es más lento[cite: 161, 263]. [cite_start]`HashMap` no es sincronizado y es más rápido, pero no es seguro para hilos concurrentes sin sincronización externa[cite: 160].
* **Nulos:** `HashMap` permite una clave nula y múltiples valores nulos. `Hashtable` no permite claves ni valores nulos.

**7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?**
Es más conciso y declarativo. Permite transformar listas en mapas en una sola línea de código, facilita el manejo de inmutabilidad y ofrece funciones integradas (`mergeFunction`) para resolver conflictos de claves duplicadas de manera elegante sin necesidad de escribir lógica condicional compleja `if-else`.

**8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?**
Estás realizando una operación de **transformación**. `map()` toma cada elemento de la lista original y le aplica una función para convertirlo en otro objeto o valor, resultando en un nuevo stream con los elementos transformados (por ejemplo, convertir una lista de objetos `Estudiante` a una lista de `String` con solo sus correos).

**9. ¿Qué hace el método stream().filter() y qué retorna?**
Evalúa una condición (predicado) sobre cada elemento del flujo. Retorna un **nuevo stream** que contiene únicamente los elementos que cumplieron dicha condición (es decir, aquellos para los que la condición devolvió `true`).

**10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.**
1.  Moverse a la rama base: `git checkout develop`
2.  Actualizar la rama para tener lo último: `git pull origin develop`
3.  Crear y cambiar a la nueva rama: `git checkout -b feature/nueva-funcionalidad`

**11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?**
* `git branch nombre_rama`: Solo **crea** la rama, pero tú sigues parado en la rama anterior.
* `git checkout -b nombre_rama`: Crea la rama y te **mueve** (hace switch) a ella inmediatamente en un solo paso.

**12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?**
Para aislar el desarrollo y mantener la estabilidad del proyecto. `main` (o producción) debe contener siempre código funcional y libre de errores. Al trabajar en `feature/`, puedes romper cosas, experimentar y hacer cambios incompletos sin afectar la versión estable que usan los clientes u otros desarrolladores hasta que tu código esté listo y probado.