Dependencies:
    
    openjdk-8-jre
    
    java 1.8.0 (1.8.0_382)

    randoop 4.3.1

    evosuite 1.0.6
    
    daikon 5.8.16

    javaparser 3.25.5

    OASIs (commit 6b81447f9a4d6fcfe048b99bee7e6e38f7431468, may 3 2018)

Repository distribution:

    * results/: contains the results obtained from the experiments, these are generated tests, generated specifications, generated assertions and the results obtained from OASIs's analysis
    * scripts/: contains all the necessary scripts for recreating the experiments and making the project work
    * libs/: contains all the necessary libraries used by the scripts
    * resources/: contains files used by the scripts
    * subjects/: contains all the subjects that were run for the experiments, these are extracted from https://github.com/facumolina/ground-truth-subjects
    * original_subject_classes/: has the same contents as subjects/ but it's used to restore the subjects when they are modified for generating assertions

Preparation for running subjects:

    * give execution permission to all scripts at scripts/ and their subfolders
    * all scripts are meant to be called from project root, the same logic applies for make commands
    * execute the configuration script using source as: 
    
        source scripts/config.sh

    * daikon and OASIs needs to be installed in the directory outside project root, so they can be 
      reached with ../ from project root
    * note that the subjects that are run in the scripts are those at resources/subject_names.txt, 
      they are separated by semicolons as: 
      subject_name;package;class_name;method_name

Running subjects:

    to generate tests and specifications run:
        ./scripts/generate_specs <testing tool>

        for example ./scripts/generate_specs randoop

    to insert specifications in their respective classes as assertions run:
        ./scripts/generate_assertions <testing tool>

        for example ./scripts/generate_assertions randoop

    to check false positives over classes specifications run:
        ./scripts/check_false_positives.sh <used tool for tests>

        for example ./scripts/check_false_positives.sh evosuite
