# ObjectOrientedProgramming-
Exercise from the course "Programmazione Orientata agli Oggetti" of the University of study of Udine

# Exercixe test- 
A Region must manage the administration of vaccines to the population for a range
of various pathologies. For each pathology, there are 1 or more drugs that can be
used as vaccines. Each vaccination of a person occurs on a certain date; the
dosage of the drug depends on the age of the person. For each pathology, each person
may be subject to 1 or more subsequent vaccinations, with the same or different drugs. For
each pathology, there are various rules relating to vaccination campaigns. A rule
it concerns the minimum age under which the administration of a specific one is not admissible
drug. Another rule concerns the minimum and maximum distance between vaccinations
subsequent to the same person, and the dosages that depend on age (<6 years, between 6 and 12, from
12 to 18,> 18). A rule determines the possible compatibilities between drugs other than one
vaccination at the next. A rule also determines the official duration of effectiveness
of a sequence of vaccinations to a person.
You need an API that allows you to implement these core operations
(indicative signatures only):
• listsVaccinatedPersons (), which allows you to extract people and produce data
the vaccinations carried out (pathology, dates, drug, dosage)
• coverage (), which given a person and a pathology, allows you to tell what the
duration of vaccination coverage and when it would be appropriate for the person
should have a vaccination
• configureRule (), to be able to specify the details of each of the existing rules
(eg. for the minimum age, dosages, durations, ...).
Write a main that contains calls to each of these methods. Consider that
new rules can be introduced frequently
