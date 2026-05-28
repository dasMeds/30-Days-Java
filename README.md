# 30-Days-Java
> Personal Java practice repo — 30 days of code, notes, and mini-projects as I learn from the ground up.

![progress](https://img.shields.io/badge/progress-0%2F30%20days-blue?style=flat-square)
![java](https://img.shields.io/badge/Java-17+-orange?style=flat-square)
![status](https://img.shields.io/badge/status-in%20progress-green?style=flat-square)

---

## About

This is my personal Java learning repository. Each day I study one concept and immediately apply it by building a small, real project. No copy-pasting tutorials — everything is written from scratch.

**Approach:** concept → build → commit → repeat.

---

## Roadmap

### Week 1 — Basics & environment

| Day | Project | Concept | Status |
|-----|---------|---------|--------|
| 01 | Temperature converter — °C ↔ °F ↔ K from user input | Variables, data types, Scanner | ⬜ |
| 02 | Simple calculator — +, -, *, / with menu choice | Operators, if/else | ⬜ |
| 03 | Grade classifier — input score, print letter grade | Comparison, ternary operator | ⬜ |
| 04 | FizzBuzz+ — FizzBuzz 1–100, also flags primes | Loops, modulo, nested conditions | ⬜ |
| 05 | Number guessing game — random number, high/low hints | while loop, break, Math.random() | ⬜ |
| 06 | Score analyser — avg, max, min, pass/fail from array | Arrays, for loop, basic I/O | ⬜ |
| 07 | Unit converter toolkit — km↔mi, kg↔lb, l↔gal | Methods, params, return values | ⬜ |

---

### Week 2 — Object-oriented programming

| Day | Project | Concept | Status |
|-----|---------|---------|--------|
| 08 | Car class — make/model/speed, accelerate & brake methods | Classes, objects, constructors | ⬜ |
| 09 | Bank account — deposit, withdraw, reject invalid ops | Encapsulation, private fields, getters | ⬜ |
| 10 | Animal hierarchy — Dog/Cat subclasses with speak() | Inheritance, super(), overriding | ⬜ |
| 11 | Shape area calculator — Circle, Rectangle, Triangle | Polymorphism, method overloading | ⬜ |
| 12 | Payable interface — Employee & Freelancer getPay() | Abstract classes, interfaces | ⬜ |
| 13 | Word frequency counter — count, longest word, palindrome | String methods, StringBuilder | ⬜ |
| 14 | Library system — borrow, return, overdue fine calc | OOP consolidation mini-project | ⬜ |

---

### Week 3 — Collections, errors & files

| Day | Project | Concept | Status |
|-----|---------|---------|--------|
| 15 | To-do list (CLI) — add, remove, mark done | ArrayList, generics, iteration | ⬜ |
| 16 | Word dictionary — store, lookup, list all entries | HashMap, HashSet | ⬜ |
| 17 | Safe divide app — catch division by zero & bad input | try/catch/finally, custom exception | ⬜ |
| 18 | Note saver — type notes, save to .txt, reload on start | File I/O, BufferedWriter, try-with-resources | ⬜ |
| 19 | Playlist manager — add/remove songs, shuffle, print | Iterator, ListIterator, for-each | ⬜ |
| 20 | Day-of-week calculator — input date → day name + days until weekend | Enum, static methods | ⬜ |
| 21 | Contact book — full CRUD, persisted to file | Collections + File I/O combined | ⬜ |

---

### Week 4 — Modern Java & capstone

| Day | Project | Concept | Status |
|-----|---------|---------|--------|
| 22 | List transformer — filter evens, square, sort with lambdas | Lambda expressions, functional interfaces | ⬜ |
| 23 | Student report generator — top 3, avg score, pass rate | Streams: filter, map, collect, reduce | ⬜ |
| 24 | Safe user lookup — find by ID, handle missing gracefully | Optional\<T\>, orElse, ifPresent | ⬜ |
| 25 | Generic stack — push, pop, peek for any type | Generics, bounded types | ⬜ |
| 26 | Multithreaded downloader — 3 threads simulate downloads | Thread, Runnable, join() | ⬜ |
| 27 | Test the bank account — deposit, withdraw, overdraft tests | JUnit 5, @Test, assertions | ⬜ |
| 28 | Maven CLI app — scaffold project, add Gson dependency | Maven, pom.xml, build lifecycle | ⬜ |
| 29 | Expense tracker Day 1 — design classes, add/list/save | Capstone: OOP + Collections + File I/O | ⬜ |
| 30 | Expense tracker Day 2 — streams summary + JUnit tests | Capstone: Streams + Lambda + Testing | ⬜ |

---

## Folder structure

```
java-diary/
├── week-1/
│   ├── Day01_TemperatureConverter.java
│   ├── Day02_Calculator.java
│   └── ...
├── week-2/
├── week-3/
├── week-4/
└── README.md
```

Each file is self-contained and runnable on its own.

---

## Setup

```bash
# Clone the repo
git clone https://github.com/your-username/30-Days-Java
cd 30-Days-Java

# Run any day's project (Java 17+)
cd week-1
javac Day01_TemperatureConverter.java
java Day01_TemperatureConverter
```

---

## Progress

Update the badge at the top as you go. Replace `0%2F30` with your current day:

```
![progress](https://img.shields.io/badge/progress-15%2F30%20days-blue?style=flat-square)
```

Change `blue` to `green` when all 30 days are done.

---

## Resources

- [W3Schools Java](https://www.w3schools.com/java) — quick syntax reference
- [Official Java docs](https://docs.oracle.com/en/java/)
- [Exercism Java track](https://exercism.org/tracks/java) — extra practice
- [Baeldung](https://www.baeldung.com/) — in-depth guides
- [JUnit 5 docs](https://junit.org/junit5/docs/current/user-guide/) — for week 4

---

*Started: <!-- your start date here -->*
