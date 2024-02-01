CREATE TABLE question_to_answer(
question_id INTEGER REFERENCES questions(id),
answer_id INTEGER REFERENCES answers(id),
is_correct BOOLEAN NOT NULL
);