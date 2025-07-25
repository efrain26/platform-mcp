# [PROYECTO-XXX]: [Título Descriptivo del Ticket]

> **📝 TEMPLATE DE TICKET PARA IA**  
> Este template debe ser completado antes de asignar el trabajo a la IA.  
> 
> **Nomenclatura de Tickets**: `[NOMBRE_PROYECTO]-[000]`  
> - **NOMBRE_PROYECTO**: Nombre del módulo/área (ej: AUTH, PLATFORM, USER, API)  
> - **000**: Número secuencial de 3 dígitos (001, 002, 003, etc.)  
> 
> **Ejemplos válidos**: 
> - `AUTH-001`, `AUTH-102` 
> - `PLATFORM-001`, `PLATFORM-045`
> - `USER-001`, `API-023`
>
> **📚 REFERENCIAS DE DOCUMENTACIÓN**:
> - Consultar `.github/ARCHITECTURE.md` para patrones arquitectónicos
> - Revisar `.github/CODING_STANDARDS.md` para estándares de código
> - Verificar `.github/API_GUIDELINES.md` para diseño de APIs
> - Consultar `.github/SECURITY_GUIDELINES.md` para consideraciones de seguridad
> - Revisar `.github/TESTING_STRATEGY.md` para estrategia de testing

## 📋 Información del Ticket

| Campo | Valor |
|-------|--------|
| **ID** | [PROYECTO-XXX] |
| **Tipo** | [Feature/Bug/Enhancement/Task] |
| **Prioridad** | [Baja/Media/Alta/Crítica] |
| **Estado** | ToDo |
| **Estimación** | [X story points] |
| **Asignado a** | IA Developer |
| **Epic** | [Nombre del Epic] |
| **Sprint** | [Sprint XX] |

## 🎯 Resumen Ejecutivo

**Como** [tipo de usuario]  
**Quiero** [funcionalidad deseada]  
**Para** [beneficio/valor obtenido]  

## 📖 Contexto de Negocio

### Problema Actual
- [Describir el problema específico que se está resolviendo]
- [Dolor o frustración actual de los usuarios]
- [Situación competitiva o de mercado relevante]

### Valor de Negocio
- **Métrica Principal**: [Métrica clave a impactar]
- **Métrica Secundaria**: [Métrica secundaria]
- **Impacto**: [Impacto esperado en el negocio]

### Criterios de Éxito
- [ ] [Criterio de éxito 1]
- [ ] [Criterio de éxito 2]
- [ ] [Criterio de éxito 3]
- [ ] [Criterio de éxito 4]

## 🔧 Especificaciones Técnicas

### Arquitectura Objetivo
```mermaid
[Incluir diagrama mermaid si es necesario]
```

### Componentes Afectados
- `[ruta/archivo1.py]` - [Descripción de cambios]
- `[ruta/archivo2.py]` - [Descripción de cambios]
- `[ruta/archivo3.py]` - [Descripción de cambios]

### Flujo de Datos
1. **[Paso 1]**:
   - [Descripción detallada del primer paso]
   - [Detalles técnicos relevantes]

2. **[Paso 2]**:
   - [Descripción detallada del segundo paso]
   - [Detalles técnicos relevantes]

3. **[Paso 3]**:
   - [Descripción detallada del tercer paso]
   - [Detalles técnicos relevantes]

### Endpoints Requeridos

#### Nuevos Endpoints
```python
[MÉTODO] /[ruta/endpoint]
# Body: {campo1, campo2, campo3}
# Response: {respuesta_esperada}

[MÉTODO] /[ruta/endpoint2]
# Body: {campos}
# Response: {respuesta_esperada}
```

#### Endpoints Modificados
```python
# [archivo.py] - [Descripción de modificación]
# [Detallar qué parámetros se agregan/modifican]
```

### Modelo de Datos

#### Nueva Tabla: [nombre_tabla]
```sql
CREATE TABLE [nombre_tabla] (
    [campo1] [TIPO] [CONSTRAINTS],
    [campo2] [TIPO] [CONSTRAINTS],
    [campo3] [TIPO] [CONSTRAINTS],
    -- Agregar más campos según sea necesario
    FOREIGN KEY ([campo]) REFERENCES [tabla_referencia] ([campo]) ON DELETE CASCADE
);
```

### Consideraciones de Seguridad
- [Consideración de seguridad 1]
- [Consideración de seguridad 2]
- [Consideración de seguridad 3]

## 🎨 Especificaciones de UI/UX

### [Componente UI que se modificará]
```html
<!-- [Descripción del cambio de UI] -->
[Código HTML/CSS/JS necesario]
```

### [Funcionalidad futura relacionada]
- [Descripción de funcionalidad futura 1]
- [Descripción de funcionalidad futura 2]

## 🧪 Criterios de Aceptación

### Funcionales
- [ ] **AC1**: [Criterio de aceptación funcional 1]
- [ ] **AC2**: [Criterio de aceptación funcional 2]
- [ ] **AC3**: [Criterio de aceptación funcional 3]
- [ ] **AC4**: [Criterio de aceptación funcional 4]
- [ ] **AC5**: [Criterio de aceptación funcional 5]

### No Funcionales
- [ ] **AC6**: [Criterio de performance - tiempo de respuesta]
- [ ] **AC7**: [Criterio de seguridad]
- [ ] **AC8**: [Criterio de escalabilidad/rate limiting]
- [ ] **AC9**: [Criterio de monitoreo/logs]

### Técnicos
- [ ] **AC10**: [Criterio de migración/deployment]
- [ ] **AC11**: [Criterio de testing - cobertura > 90%]
- [ ] **AC12**: [Criterio de testing - integración]
- [ ] **AC13**: [Criterio de documentación]

## 🔄 Casos de Uso Detallados

### Caso de Uso 1: [Nombre del Caso de Uso]
```gherkin
Given [condición inicial]
When [acción del usuario]
Then [resultado esperado]
And [resultado adicional]
```

### Caso de Uso 2: [Nombre del Caso de Uso]
```gherkin
Given [condición inicial]
When [acción del usuario]
Then [resultado esperado]
And [resultado adicional]
```

### Caso de Uso 3: [Manejo de Errores]
```gherkin
Given [condición de error]
When [acción que causa error]
Then [manejo de error esperado]
And [comportamiento adicional]
```

## 🛠️ Tareas de Implementación

### Backend
- [ ] **T1**: [Tarea específica de backend 1]
- [ ] **T2**: [Tarea específica de backend 2]
- [ ] **T3**: [Tarea específica de backend 3]
- [ ] **T4**: [Tarea específica de backend 4]
- [ ] **T5**: [Tarea específica de backend 5]
- [ ] **T6**: [Tarea específica de backend 6]
- [ ] **T7**: [Tarea específica de backend 7]
- [ ] **T8**: [Tarea específica de backend 8]

### Testing
- [ ] **T9**: [Tarea de testing 1]
- [ ] **T10**: [Tarea de testing 2]
- [ ] **T11**: [Tarea de testing 3]
- [ ] **T12**: [Tarea de testing 4]
- [ ] **T13**: [Tarea de testing 5]

### Documentación
- [ ] **T14**: [Tarea de documentación 1]
- [ ] **T15**: [Tarea de documentación 2]
- [ ] **T16**: [Tarea de documentación 3]

## 📊 Métricas y Monitoreo

### KPIs
- [Métrica clave 1 antes/después]
- [Métrica clave 2 por período de tiempo]
- [Métrica de performance/error rate]
- [Métrica de uso/adopción]

### Alertas
- [Alerta por comportamiento anómalo 1]
- [Alerta por performance degradada]
- [Alerta por volume excesivo]

## 🔗 Dependencias

### Upstream (Bloquean este ticket)
- [TICKET-001]: [Descripción de dependencia]
- [TICKET-002]: [Descripción de dependencia]

### Downstream (Bloqueados por este ticket)
- [PROYECTO-XXX]: [Descripción del ticket que depende de este]
- [PROYECTO-YYY]: [Descripción del ticket que depende de este]

## 📝 Notas Adicionales

### Decisiones Técnicas
- **[Decisión 1]**: [Opción A vs Opción B]
  - **Decisión**: [Opción elegida y justificación]
- **[Decisión 2]**: [Opción A vs Opción B]
  - **Decisión**: [Opción elegida y justificación]

### Riesgos Identificados
- **[Nivel]**: [Descripción del riesgo]
  - **Mitigación**: [Estrategia de mitigación]
- **[Nivel]**: [Descripción del riesgo]
  - **Mitigación**: [Estrategia de mitigación]

### Consideraciones Futuras
- [Consideración futura 1]
- [Consideración futura 2]
- [Consideración futura 3]

---

**Creado por**: [Nombre del creador]  
**Fecha de creación**: [YYYY-MM-DD]  
**Última actualización**: [YYYY-MM-DD]  
**Reviewers**: [Lista de reviewers]

---

## 🤖 FLUJO DE TRABAJO PARA IA DEVELOPER

> **📋 INSTRUCCIONES PARA IA**: Cuando recibas este ticket para implementar, sigue este flujo paso a paso.

### 🔄 Proceso de Implementación

#### 1. Inicio de Trabajo
```markdown
- [ ] Cambiar estado del ticket: ToDo → WORKING_PROGRESS
- [ ] Documentar fecha/hora de inicio
- [ ] Leer completamente el ticket y entender los requerimientos
```

#### 2. Consulta de Documentación
```markdown
- [ ] Revisar `.github/ARCHITECTURE.md` - Entender arquitectura del módulo
- [ ] Consultar `.github/CODING_STANDARDS.md` - Aplicar estándares
- [ ] Verificar `.github/API_GUIDELINES.md` - Seguir patrones de API
- [ ] Revisar `.github/SECURITY_GUIDELINES.md` - Implementar medidas de seguridad
- [ ] Consultar `.github/TESTING_STRATEGY.md` - Planificar testing
```

#### 3. Análisis y Planificación
```markdown
- [ ] Analizar componentes afectados listados en el ticket
- [ ] Identificar dependencias adicionales no documentadas
- [ ] Evaluar riesgos técnicos
- [ ] Crear plan de implementación paso a paso
- [ ] Documentar approach técnico seleccionado
```

#### 4. Implementación Iterativa
```markdown
Iteración 1 - Core Functionality:
- [ ] Implementar lógica principal
- [ ] Crear/modificar modelos de datos si es necesario
- [ ] Implementar servicios principales
- [ ] Ejecutar tests unitarios básicos

Iteración 2 - API Layer:
- [ ] Implementar/modificar endpoints según especificación
- [ ] Actualizar schemas de request/response
- [ ] Implementar validaciones y manejo de errores
- [ ] Ejecutar tests de integración

Iteración 3 - Seguridad y Performance:
- [ ] Implementar medidas de seguridad especificadas
- [ ] Agregar logs y monitoreo
- [ ] Optimizar queries y performance
- [ ] Validar todos los criterios de aceptación
```

#### 5. Testing y Validación
```markdown
- [ ] Ejecutar suite completa de tests unitarios
- [ ] Verificar coverage de tests unitarios > 90%
- [ ] Ejecutar tests de integración
- [ ] Validar performance según criterios del ticket
- [ ] Verificar medidas de seguridad implementadas
- [ ] Testear manualmente flujos críticos
```

#### 6. Documentación de Resolución
```markdown
- [ ] Documentar todos los cambios realizados
- [ ] Listar archivos creados/modificados con descripción
- [ ] Documentar decisiones técnicas tomadas
- [ ] Reportar métricas de performance obtenidas
- [ ] Listar consideraciones de seguridad implementadas
```

#### 7. Finalización
```markdown
- [ ] Cambiar estado: WORKING_PROGRESS → READY_FOR_REVIEW
- [ ] Documentar tiempo total invertido
- [ ] Crear ticket relacionado para frontend/mobile (si aplica)
- [ ] Agregar notas para el revisor
```

### 🎯 Criterios de Completion

**✅ El ticket está listo para revisión cuando**:
- Todos los criterios de aceptación están cumplidos
- Tests unitarios e integración pasan al 100%
- Coverage de tests unitarios es superior al 90%
- Código sigue estándares documentados
- Medidas de seguridad están implementadas
- Documentación de resolución está completa
- Performance cumple con los criterios especificados

### 🚨 Escalación

**Si encuentras blockers**:
1. Documentar el blocker en el ticket
2. Cambiar estado a BLOCKED
3. Notificar al revisor/product owner
4. Proponer alternativas o solicitar clarificación
