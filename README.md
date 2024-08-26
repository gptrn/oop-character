# Object Oriented Programming Character Case Study

## Description
An OOP case study of generic Character Class in game.
[Here's the Google Docs Link...](https://docs.google.com/document/d/1SfA0n4gf2dMoEv-UnHUOUnf0ZzSxLKAUp__gcnMQMw0/edit?usp=sharing)

## Information
| Key          | Value                       |
|--------------|-----------------------------|
| Duration     | 20-30 minutes               |
| Requirements | Object Oriented Programming |
| Difficulty   | Intermediate                |

## Goal
Assess participants' knowledge and experience of OOP concepts and implementation in app development.

## Instruction
There are 2 parts:
- The "Part 1" will instruct you to write a Character Class to learn about the "Composition" and "Encapsulation" of the OOP concept. 
- The "Part 2" will instruct you to write the Sub-Classes of Character Class to learn about the "Inheritance" concept in the OOP

## Part 1

### Character Class

#### Description
This Character Class is the representation or blueprint of a character in a game. When you play a character in a game, it has some attributes such as, character id, name, health point, and other stats.

#### Character Attributes
- `m_ id` : NUMBER : UNIQUE
    - Character unique identifier.

- `m_name` : TEXT
    - Characters name

- `m_isAlive` : BOOLEAN
    - Characters' life state.

- `m_currentHP` : NUMBER
    - Current health point of character.
    Minimum value is 0, if value dropped to 0, m_isAlive is set to false

- `m_maxHP`: NUMBER
    - Maximum health point of the character.

- `m_atk` : NUMBER
    - Characters attack value.

- `m_def`: NUMBER
    - Characters' defense value.

#### Character Functions

##### Public
- Constructors (& Destructor, optional, only if the programming language is supporting class destructor, e.g. C++)
- Getters & Setters
- PrintBasicInfo()
    - Output characters current state, HP and MP, example:
        ```
        Grezzle (ALIVE)
        -----------------------------
        HP: 90/100
        ```
- BasicAttack(Character target)
    - If both characters are alive, a basic attack could proceed.
    - If one of the characters (the attacker or the target) is dead, the basic attack can not proceed. 
    - Print a text: 
        ```
        “Basic Attack FAILED, the <attacker/target> (characters name) is DEAD.”,
        ```
        examples:
        ```
        “Basic Attack FAILED, the target (Grezzle) is DEAD.”
        ```
        ```
        “Basic Attack FAILED, the attacker (Balmont) is DEAD.”
        ```
    - If proceed, Print attackers name and targets name and the damage value:
        > Damage received = this.m_stats.atk - target.m_stats.def
    - Case Example:
        - Balmont with 100 atk is attacking Grezzle with 32 def.
        - Grezzle’s current HP is 90.
        - Balmont.BasicAttack(Grezzle);
        - Output Example:
            ```
            “Balmont is launching a basic attack to Grezzle with damage value 68…”
            ```
        - Grezzle.PrintBasicInfo()
            ```
            Grezzle (ALIVE)
            -----------------------------
            HP: 22/100
        - Balmont.BasicAttack(Grezzle);
            ```
            “Balmont is launching a basic attack to Grezzle with damage value 68…”
            ```
        - Grezzle.PrintBasicInfo()
            ```            
            Grezzle (DEAD)
            -----------------------------
            HP: 0/100
            ```
    - If the attack valid, call targets' ReceiveDamage() function.
- ReceiveDamage(int damage)
    - Reduce character's current HP value by damage value (param).
    - Clamp to zero and maxHP
    - If current HP is zero, set m_isAlive to false


#### Instruction
1. Write a Character class
2. Write the source code to:
    1. Create 2 Character Instances with requirements
        - Balmont, max HP 100, current HP 80, ATK 100, DEF 15
        - Grezzle, max HP 100, current HP 90, ATK 75, DEF 32
    2. Print Balmont and Grezzle Basic States
    3. Balmont attacks Grezzle
    4. Grezzle attacks Balmont
    5. Print Balmont and Grezzle Basic States
    3. Balmont attacks Grezzle
    4. Grezzle attacks Balmont
    5. Print Balmont and Grezzle Basic States
#### Output
```
Balmont (ALIVE)
--------------------------------
HP: 80/100

Grezzle (ALIVE)
--------------------------------
HP: 90/100

Balmont is launching a basic attack to Grezzle with damage value 68...

Grezzle is launching a basic attack to Balmont with damage value 60...

Balmont (ALIVE)
--------------------------------
HP: 20/100

Grezzle (ALIVE)
--------------------------------
HP: 22/100

Balmont is launching a basic attack to Grezzle with damage value 68...

Basic Attack FAILED, the attacker (Grezzle) is DEAD.

Balmont (ALIVE)
--------------------------------
HP: 20/100

Grezzle (DEAD)
--------------------------------
HP: 0/100
```

## Part 2
Write 2 classes of Character subclasses: Hero, and Monster

### Hero
- Has enumeration 
    - `HeroType: MELEE, RANGED, MAGIC, TANK, HEALER, BUFFER`
- Has function 
    - CastSkill(Skill skillInstance, Character target);
    - PrintBasicInfo() adds additional information of the HeroType
    ```
    HERO | Grezzle [RANGED] (DEAD)
    -----------------------------
    HP: 0/100
    ```
### Monster
- Has enumeration 
    - `MonsterType: WILD, MINION, MINI_BOSS, BOSS`
- Has function
    - Targets(Character target);
    - PrintBasicInfo() adds additional information of the MonsterType
    ```
    MONSTER | Gobleen [WILD] (ALIVE)
    -----------------------------
    HP: 30/30

### Instruction

1. Write Hero, and Monster classes, with each type's enumerator!
1. Create 2 Hero instances with different HeroTypes!
1. Create 3 Monster instances with different MonsterTypes!
1. Write the Testcase:
    1. Print Hero1 info
    1. Print Hero2 info
    1. Print Monster1 info
    1. Print Monster2 info
    1. Print Monster3 info
    1. Hero1 Casts Skill1 to Monster1
    1. Hero2 Casts Skill2 to Monster1
    1. Monster1 targets Hero1
