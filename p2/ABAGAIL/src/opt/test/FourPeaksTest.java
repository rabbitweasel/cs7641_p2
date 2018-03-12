package opt.test;

import java.util.Arrays;

import dist.DiscreteDependencyTree;
import dist.DiscreteUniformDistribution;
import dist.Distribution;

import opt.DiscreteChangeOneNeighbor;
import opt.EvaluationFunction;
import opt.GenericHillClimbingProblem;
import opt.HillClimbingProblem;
import opt.NeighborFunction;
import opt.RandomizedHillClimbing;
import opt.SimulatedAnnealing;
import opt.example.*;
import opt.ga.CrossoverFunction;
import opt.ga.DiscreteChangeOneMutation;
import opt.ga.SingleCrossOver;
import opt.ga.GenericGeneticAlgorithmProblem;
import opt.ga.GeneticAlgorithmProblem;
import opt.ga.MutationFunction;
import opt.ga.StandardGeneticAlgorithm;
import opt.prob.GenericProbabilisticOptimizationProblem;
import opt.prob.MIMIC;
import opt.prob.ProbabilisticOptimizationProblem;
import shared.FixedIterationTrainer;

/**
 * Copied from ContinuousPeaksTest
 * @version 1.0
 */
public class FourPeaksTest {
    /** The n value */
    private static final int N = 100; // 100
    /** The t value */
    private static final int T = 10; //N / 5;
    
    public static void main(String[] args) {
        int[] ranges = new int[N];
        Arrays.fill(ranges, 2);
        EvaluationFunction ef = new FourPeaksEvaluationFunction(T);
        Distribution odd = new DiscreteUniformDistribution(ranges);
        NeighborFunction nf = new DiscreteChangeOneNeighbor(ranges);
        MutationFunction mf = new DiscreteChangeOneMutation(ranges);
        CrossoverFunction cf = new SingleCrossOver();
        Distribution df = new DiscreteDependencyTree(.1, ranges); 
        HillClimbingProblem hcp = new GenericHillClimbingProblem(ef, odd, nf);
        GeneticAlgorithmProblem gap = new GenericGeneticAlgorithmProblem(ef, odd, mf, cf);
        ProbabilisticOptimizationProblem pop = new GenericProbabilisticOptimizationProblem(ef, odd, df);

        int rhcGood = 0;
        double rhcAverage = 0;
        double rhcMax = 0;
        int saGood = 0;
        double saAverage = 0;
        double saMax = 0;
        int gaGood = 0;
        int gaAverage = 0;
        double gaMax = 0;
        int mimicGood = 0;
        int mimicAverage = 0;
        double mimicMax = 0;

        int iter = 10;

        long start = System.currentTimeMillis();
        for (int i=0; i<iter; i++) {
            FixedIterationTrainer fit; // = new FixedIterationTrainer(rhc, 200000);
            RandomizedHillClimbing rhc = new RandomizedHillClimbing(hcp);
            fit = new FixedIterationTrainer(rhc, 200000);
            fit.train();
            //System.out.println("RHC: " + ef.value(rhc.getOptimal()));
            rhcAverage += ef.value(rhc.getOptimal());
            if (ef.value(rhc.getOptimal()) > N) {
                rhcGood++;
            }
            if (ef.value(rhc.getOptimal()) > rhcMax) {
                rhcMax = ef.value(rhc.getOptimal());
            }

            StandardGeneticAlgorithm ga = new StandardGeneticAlgorithm(500, 500, 10, gap);
            fit = new FixedIterationTrainer(ga, 1000);
            fit.train();
            //System.out.println("GA: " + ef.value(ga.getOptimal()));
            gaAverage += ef.value(ga.getOptimal());
            if (ef.value(ga.getOptimal()) > N) {
                gaGood++;
            }
            if (ef.value(ga.getOptimal()) > gaMax) {
                gaMax = ef.value(ga.getOptimal());
            }

            SimulatedAnnealing sa = new SimulatedAnnealing(1E11, .95, hcp);
            fit = new FixedIterationTrainer(sa, 200000);
            fit.train();
            //System.out.println("SA: " + ef.value(sa.getOptimal()));
            saAverage += ef.value(sa.getOptimal());
            if (ef.value(sa.getOptimal()) > N) {
                saGood++;
            }
            if (ef.value(sa.getOptimal()) > saMax) {
                saMax = ef.value(sa.getOptimal());
            }

            MIMIC mimic = new MIMIC(200, 20, pop);
            fit = new FixedIterationTrainer(mimic, 1000);
            fit.train();
            mimicAverage += ef.value(mimic.getOptimal());
            if (ef.value(mimic.getOptimal()) > N) {
                mimicGood++;
            }
            if (ef.value(mimic.getOptimal()) > mimicMax) {
                mimicMax = ef.value(mimic.getOptimal());
            }

            System.out.print((i+1)*10 + "% ");

            /*
            SimulatedAnnealing sa = new SimulatedAnnealing(1, .01, hcp);
            sa.getOptimal().setData(ga.getOptimal().getData());
            fit = new FixedIterationTrainer(sa, 200000);
            fit.train();
            //System.out.println("SA: " + ef.value(sa.getOptimal()));
            saAverage += ef.value(sa.getOptimal());
            if (ef.value(sa.getOptimal()) == 189) {
                saGood++;
            }

            RandomizedHillClimbing rhc = new RandomizedHillClimbing(hcp);
            rhc.getOptimal().setData(ga.getOptimal().getData());
            fit = new FixedIterationTrainer(rhc, 200000);
            fit.train();
            //System.out.println("RHC: " + ef.value(rhc.getOptimal()));
            rhcAverage += ef.value(rhc.getOptimal());
            if (ef.value(rhc.getOptimal()) > N) {
                rhcGood++;
            }
            */
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("N = " + N + " ,T = " + T + ", max possible: " + (2*N-(T+1)));
        System.out.println("Time: " + (end-start)/1000.0);
        System.out.println("RHC average: " + (1.0*rhcAverage)/iter);
        System.out.println("RHC above N: " + rhcGood);
        System.out.println("RHC max: " + rhcMax);
        System.out.println("SA average: " + (1.0*saAverage)/iter);
        System.out.println("SA above N: " + saGood);
        System.out.println("SA max: " + saMax);
        System.out.println("GA average: " + (1.0*gaAverage)/iter);
        System.out.println("GA above N: " + gaGood);
        System.out.println("GA max: " + gaMax);
        System.out.println("MIMIC average: " + (1.0*mimicAverage)/iter);
        System.out.println("MIMIC above N: " + mimicGood);
        System.out.println("MIMIC max: " + mimicMax);

        //System.out.println("MIMIC: " + ef.value(mimic.getOptimal()));
        //@ maximizing score
        // Definitely SA, Fast and reaches best value more often than other 3 approaches with few iterations
        // GA on average however 99% runs find value > N but never top
        // Start with GA parameters and perform SA on those
    }
}
