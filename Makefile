clean_builds:
	find subjects/ -type d -name build -prune -exec rm -rf {} \;

clean_tests:
	find subjects/ -type d -name test -prune -exec rm -rf {} \;
	rm subjects/*/randoop_log.txt ; rm subjects/*/evosuite_log.txt;

clean_results:
	rm -r generated_specs/ ; rm -r OASIs_results/;
