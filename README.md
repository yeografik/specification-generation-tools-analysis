Dependencies:
    
    openjdk-8-jre
    
    java 1.8.0 (1.8.0_382)

    randoop 4.3.1

    evosuite 1.0.6
    
    daikon 5.8.16

    javaparser 3.25.5

    OASIs (commit 6b81447f9a4d6fcfe048b99bee7e6e38f7431468, may 3 2018)


Before anything
    * give execution permission to all scripts at scripts/ and their subfolders
    * all scripts are meant to be called from project root, the same goes for make commands
    * execute the configuration script using source as: 
    
        source scripts/config.sh

    * daikon and OASIs needs to be installed in the directory outside project root, so they can be 
      reached with ../ from project root
    * note that the subjects that are run in the scripts are those at resources/subject_names.txt, they
      are separated by semicolons as: subject_name;package;class_name;method_name

Running a single subject:

    to genenerate tests run:
        ```
        ./scripts/generate_single_class_tests <subject name> <package name> <class name> <testing tool>
        ```

        for example `./scripts/generate_single_class_tests ringbuffer_item examples RingBuffer randoop`
    
    to generate specifications run:
        ```
        ./scripts/generate_daikon_specs <subject name> <package name> <class name> <class method> <testing tool>
        ```

        for example `./scripts/generate_daikon_specs ringbuffer_item examples RingBuffer item randoop`

    to execute OASIs over a subject run:    DEPRECATED FOR NOW
        ```
        ./scripts/run_OASIs.sh <class with package> <src location> <method name> <subject name> <additional jar paths> (optional, separated by ':' if more than 2)
        ```

        <additional jar paths> is optional, paths must be separated by ':' if more than 2 are provided

        for example `./scripts/run_OASIs.sh examples.RingBuffer subjects/ringbuffer_item/src/main/java/ item ringbuffer_item`

        example with additional jar paths `./scripts/run_OASIs.sh org.apache.commons.math3.util.MathUtilsNew subjects/MathUtilsNew_copySignInt/src/main/java/ copySignInt MathUtilsNew_copySignInt subjects/MathUtilsNew_copySignInt/libs/commons-math3-3.6.1.jar`

Running all subjects:

    to generate tests and specifications run:
        ./scripts/generate_specs <testing tool>

        for example ./scripts/generate_specs randoop

    to insert specifications in their respective classes as assertions run:
        ./scripts/generate_assertions <testing tool>

        for example ./scripts/generate_assertions randoop

    to check false positives over classes specifications run:
        ./scripts/check_false_positives.sh <used tool for tests>

        for example ./scripts/check_false_positives.sh evosuite
