# EldenCraft v2.3 🎮

Plugin MMO para Minecraft Paper con razas, clases, niveles, habilidades, misiones, economía, tienda, partys y armaduras RPG.

## ✨ Características

### 🧬 Sistema de Razas (12 razas)
- **Humano** - Equilibrado (1.8 bloques)
- **Enano** - Fuerte y resistente (1.4 bloques)
- **Elfo** - Ágil e inteligente (1.9 bloques)
- **Hobbit** - Pequeño y ágil (1.2 bloques)
- **Orco** - Muy fuerte (2.0 bloques)
- **Gnomo** - Pequeño e inteligente (1.0 bloque)
- **Mediano** - Balanceado (1.3 bloques)
- **Tiefling** - Carismático (1.85 bloques)
- **Goliat** - Gigante (2.3 bloques)
- **Forjado** - Resistente (2.0 bloques)
- **No-muerto** - Especial (1.8 bloques)
- **Aasimar** - Sagrado (1.9 bloques)

### 🎯 Sistema de Clases (13 clases)
1. **Guerrero** - Sed de batalla (daño en combate)
2. **Mago** - Sabiduría arcana (menos coste maná)
3. **Explorador** - Instinto natural (velocidad en biomas)
4. **Paladín** - Juicio divino (x2 daño a no-muertos)
5. **Ladrón** - Golpe crítico (ataques por la espalda)
6. **Bardo** - Armonía (habilidades duran más)
7. **Bárbaro** - Ira creciente (furia en combate)
8. **Hechicero** - Reacción Arcana (cargas de daño)
9. **Brujo** - Pacto oscuro (vida por maná)
10. **Monje** - Camino del Puño (sin armas)
11. **Druida** - Afinidad natural (bonus por bioma)
12. **Clérigo** - Fe absoluta (curaciones potentes)
13. **Pistolero** - Recarga táctica (disparos rápidos)

### 🛡️ Sistema de Restricciones de Armadura
- **LIGHT**: Brujo, Hechicero, Monje, Mago, Explorador, Ladrón
- **MEDIUM**: Clérigo, Druida, Pistolero, Bardo
- **HEAVY**: Guerrero, Paladín, Bárbaro

### 💰 Sistema de Tienda
- Armaduras (Cuero, Hierro, Diamante)
- Armas (Madera, Piedra, Hierro, Diamante)
- Items consumibles (Manzanas, Pociones)
- Bloques

### 🔧 Sistema de Crafteos
- Espada de Madera
- Poción de Curación

## 📋 Comandos

```
/class [nombre]    - Cambiar clase
/race [nombre]     - Cambiar raza
/skills            - Ver habilidades y pasiva
/shop              - Abrir tienda
```

## 🚀 Instalación

1. Compila con Maven: `mvn clean package`
2. Copia el JAR a la carpeta `plugins/` del servidor
3. Reinicia el servidor
4. ¡Disfruta! 🎉

## 📝 Notas

- Las pasivas se muestran en `/skills` para que los jugadores recuerden sus efectos
- El sistema de restricción de armadura previene equipar armaduras no permitidas
- Las razas aplican altura real al jugador
- La tienda es visual y expandible

## 👨‍💻 Autor

TuUsuario